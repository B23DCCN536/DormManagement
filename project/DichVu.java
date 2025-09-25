package project;
public class DichVu{
	private String TenDichVu;
    private String MoTa;
    private double DonGia;
    private Boolean TrangThai;
    private Phong p;
    public DichVu(String TenDichVu, String MoTa, double DonGia, Boolean TrangThai, Phong p){
        this.TenDichVu = TenDichVu;
        this.MoTa = MoTa;
        this.DonGia = DonGia;
        this.TrangThai = TrangThai;
        this.p = p;
    }
}

