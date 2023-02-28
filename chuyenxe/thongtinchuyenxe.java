package chuyenxe;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class thongtinchuyenxe {
    private String[] diemkhoihanh;
    private String[] diemden;
    private LocalDateTime departureDateTime = LocalDateTime.parse("2023-03-01T10:30:00");

    public thongtinchuyenxe(String[] diemkhoihanh, String[] diemden) {
        this.diemkhoihanh = new String[] { "Hai Phong", "Thanh Hoa", "Ha Noi", "Tp Ho Chi Minh", "Nghe An" };
        this.diemden = new String[] { "Hai Phong", "Thanh Hoa", "Ha Noi", "Tp Ho Chi Minh", "Nghe An" };
    }

    public String[] getDiemKhoiHanh() {
        return diemkhoihanh;
    }

    public void setDiemKhoiHanh(String[] diemkhoihanh) {
        this.diemkhoihanh = diemkhoihanh;
    }

    public String[] getDiemDen() {
        return diemden;
    }

    public void setDiemDen(String[] diemden) {
        this.diemden = diemden;
    }

    public LocalDateTime getthoigian() {
        return departureDateTime;
    }

    public void setthoigian(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

}
