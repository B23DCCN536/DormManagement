package project;
public class HopDong {
    private String MaHopDong;
    private String NgayBatDau;
    private String NgayKetThuc;
    private Boolean TinhTrang;
    private SinhVien sv;
    private Phong p;
    public HopDong(String MaHopDong, String NgayBatDau, String NgayKetThuc, Boolean TinhTrang, SinhVien sv, Phong p){
        this.MaHopDong = MaHopDong;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.TinhTrang = TinhTrang;
        this.sv = sv;
        this.p = p;
    }
}
