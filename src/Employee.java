class Employee {
    private String role;

    public Employee(String role) {
        this.role = role;
    }

    public void handleRequest() {
        if (role.equals("GIAMDOC")) {
            System.out.println("Giám đốc: Quản lý công ty, đưa ra quyết định chiến lược.");
        } else if (role.equals("PHOGIAMDOC")) {
            System.out.println("Phó giám đốc: Hỗ trợ giám đốc, quản lý bộ phận.");
        } else if (role.equals("KETOAN")) {
            System.out.println("Kế toán: Quản lý tài chính, lập báo cáo tài chính.");
        } else if (role.equals("NHANVIEN")) {
            System.out.println("Nhân viên: Thực hiện công việc văn phòng, hỗ trợ khách hàng.");
        } else {
            System.out.println("Chức vụ không hợp lệ.");
        }
    }
}