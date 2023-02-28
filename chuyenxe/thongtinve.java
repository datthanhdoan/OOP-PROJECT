package chuyenxe;

public class thongtinve {
    private char loaive;
    private int giavetungloai;
    private int tienkhachdua;
    private int tienthua;

    public thongtinve() {
        this.loaive = loaive;
        this.giavetungloai = giavetungloai;
        this.tienkhachdua = tienkhachdua;
        this.tienthua = tienkhachdua - giavetungloai;
    }

    public char getlaoive() {
        return loaive;
    }

    public void setgetloaive(char loaive) {
        this.loaive = loaive;
    }

    public void settienkhachdua(int tienkhachdua) {
        this.tienkhachdua = tienkhachdua;
    }
}
