/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan43.gajipegawai;

/**
 *
 * @author User
 */
public class GajiPegawai {
    private String nama,alamat;
    private int uangTransport,uangTunjangan,gajiPokok,totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }
    
    
    
    public int totalGaji(){
      totalGaji = uangTunjangan+uangTransport+gajiPokok; 
      return totalGaji;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan,
            int uangTransport, int gajiPokok, int totalGaji){
        
        GajiPegawai objG = new GajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        objG.setNama("Surya Fakhriy Hasbi");
        objG.setAlamat("Jalan Semar dlm 4 No 72/66");
        objG.setUangTransport(250000);
        objG.setUangTunjangan(300000);
        objG.setGajiPokok(4500000);
        System.out.println("Nama Karyawam : "+objG.getNama());
        System.out.println("Alamat : "+objG.getAlamat());
        System.out.println("Uang Transport : Rp. "+objG.getUangTransport());
        System.out.println("Uang Tunjangan : Rp. "+objG.getUangTunjangan());
        System.out.println("Gaji Pokok : Rp. "+objG.getGajiPokok());
        System.out.println("Total Gaji : Rp. "+objG.totalGaji());
        
    }
}
