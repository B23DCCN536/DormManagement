package project;
public class HoaDon{
	private String MaHoaDon;
    private Double TongTien;
    private Boolean TinhTrang;
    private HopDong hd;
    private SinhVien sv;
    public HoaDon(String MaHoaDon, Double TongTien, Boolean TinhTrang, HopDong hd, SinhVien sv){
        this.MaHoaDon = MaHoaDon;
        this.TongTien = TongTien;
        this.TinhTrang = TinhTrang;
        this.hd = hd;
        this.sv = sv;
    }
}

