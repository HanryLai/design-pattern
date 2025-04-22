package iuh.fit.gatewayy.service;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @CircuitBreaker(name = "myService", fallbackMethod = "fallbackMethod")
    public String callExternalService() {
        // Giả sử đây là lời gọi đến dịch vụ bên ngoài
        throw new RuntimeException("Dịch vụ bên ngoài không khả dụng");
    }

    @Retry(name = "myService", fallbackMethod = "retryFallback")
    public String retryService() {
        // Giả sử đây là dịch vụ cần retry
        throw new RuntimeException("Lỗi khi gọi dịch vụ");
    }

    @RateLimiter(name = "myService", fallbackMethod = "rateLimitFallback")
    public String rateLimitedService() {
        // Dịch vụ bị giới hạn tần suất
        return "Request processed";
    }

    @TimeLimiter(name = "myService", fallbackMethod = "timeLimitFallback")
    public String longRunningService() throws InterruptedException {
        // Dịch vụ chạy lâu
        Thread.sleep(5000);  // Giả sử dịch vụ này mất nhiều thời gian
        return "Service completed";
    }

    // Phương thức fallback
    public String fallbackMethod(Throwable t) {
        return "Fallback response: " + t.getMessage();
    }

    public String retryFallback(Throwable t) {
        return "Retry failed after multiple attempts: " + t.getMessage();
    }

    public String rateLimitFallback(Throwable t) {
        return "Rate limit exceeded: " + t.getMessage();
    }

    public String timeLimitFallback(Throwable t) {
        return "Time limit exceeded: " + t.getMessage();
    }
}