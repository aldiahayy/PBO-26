package praktikum1;
import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah { // ini adalah class MataKuliah
    private String kodeMK;
    private String namaMK;
    private int sks;
    private String nilaiHuruf;

    public MataKuliah(String kodeMK, String namaMK, int sks, String nilaiHuruf) { // ini adalah constructor dari class MataKuliah
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.nilaiHuruf = nilaiHuruf;
    }

    public double getNilaiAngka() { // ini adalah method getter
        switch (nilaiHuruf.toUpperCase()) {
            case "A":
                return 4.00;
            case "A-":
                return 3.75;
            case "B+":
                return 3.50;
            case "B":
                return 3.00;
            case "B-":
                return 2.75;
            case "C":
                return 2.00;
            case "D":
                return 1.00;
            case "E":
                return 0.00;
            default:
                return 0.00; // T atau belum dinilai
        }
    }

    public double sksKaliNilai() {
        return sks * getNilaiAngka();
    }

    public int getSks() { // ini adalah method getter
        return sks;
    }

    public void cetak() {
        System.out.printf("| %-10s | %-50.50s | %3d | %-5s |", kodeMK, namaMK, sks, nilaiHuruf);
    }
}

class TranskripNilaiMataKuliah { // ini adalah class TranskripNilaiMataKuliah
    private String namaMHS;
    private String nim;
    private String programStudi;
    private ArrayList<MataKuliah> listMK = new ArrayList<>();

    public TranskripNilaiMataKuliah(String nama, String nim, String prodi) { // ini adalah constructor dari class TranskripNilaiMataKuliah
        this.namaMHS = nama;
        this.nim = nim;
        this.programStudi = prodi;
    }

    // edit data mahasiswa menggunakan method setter
    public void setNamaMHS(String nama) {
        this.namaMHS = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    // insert atau menambahkan data
    public void insert(String kode, String nama, int sks, String nilai) { // menambahkan data mata kuliah ke dalam transkip nilai
        listMK.add(new MataKuliah(kode, nama, sks, nilai)); // membuat object baru yaitu "new MataKuliah" dan menyimpan nya dalam ArrayList
    }

    // update atau mengganti data yang lama dengan yang baru
    public boolean update(int id, String kode, String nama, int sks, String nilai) {
        int index = id - 1;
        if (index >= 0 && index < listMK.size()) {
            listMK.set(index, new MataKuliah(kode, nama, sks, nilai));
            return true;
        }
        return false;
    }

    // delete atau menghapus data
    public boolean delete(int id) {
        int index = id - 1;
        if (index >= 0 && index < listMK.size()) {
            listMK.remove(index);
            return true;
        }
        return false;
    }

    // cetak transkrip
    public void cetak() {
        System.out.println("==========================================================================================");
        System.out.println("TRANSKRIP");
        System.out.println("==========================================================================================");
        System.out.println("Nama          : " + namaMHS);
        System.out.println("NIM           : " + nim);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-10s | %-50s | %3s | %-5s |%n",
                "ID", "KODE", "Matakuliah", "SKS", "NILAI");
        System.out.println("------------------------------------------------------------------------------------------");

        int totalSKS = 0;
        double totalMutu = 0;

        for (int i = 0; i < listMK.size(); i++) {
            System.out.printf("| %3d ", i + 1);
            listMK.get(i).cetak();
            System.out.println();

            totalSKS += listMK.get(i).getSks();
            totalMutu += listMK.get(i).sksKaliNilai();
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("SKS : " + totalSKS);
        double ipk = (totalSKS == 0) ? 0 : totalMutu / totalSKS;
        System.out.printf("IPK : %.2f%n", ipk);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

public class soal8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Mahaiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM          : ");
        String nim = sc.nextLine();
        System.out.print("Program Studi: ");
        String prodi = sc.nextLine();

        TranskripNilaiMataKuliah tr = new TranskripNilaiMataKuliah(nama, nim, prodi); // membuat object dari class TranskripNilaiMataKuliah
        char menu;

        do {
            System.out.println("################################################");
            System.out.println("PILIH MENU");
            System.out.println("[X] = Exit");
            System.out.println("[P] = Print Transkrip Nilai");
            System.out.println("[N] = Edit nama");
            System.out.println("[M] = Edit NIM");
            System.out.println("[R] = Edit Program Studi");
            System.out.println("[I] = Insert");
            System.out.println("[U] = Update");
            System.out.println("[D] = Delete");
            System.out.println("################################################");
            System.out.print("Menu yang Anda pilih: ");
            menu = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            switch (menu) {
                case 'P':
                    tr.cetak();
                    break;

                case 'N':
                    System.out.print("Nama baru: ");
                    tr.setNamaMHS(sc.nextLine());
                    break;

                case 'M':
                    System.out.print("NIM baru: ");
                    tr.setNim(sc.nextLine());
                    break;

                case 'R':
                    System.out.print("Program Studi baru: ");
                    tr.setProgramStudi(sc.nextLine());
                    break;

                case 'I':
                    System.out.print("Kode MK   : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama MK   : ");
                    String namaMK = sc.nextLine();
                    System.out.print("SKS       : ");
                    int sks = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nilai     : ");
                    String nilai = sc.nextLine();
                    tr.insert(kode, namaMK, sks, nilai);
                    break;

                case 'U':
                    tr.cetak();
                    System.out.print("ID yang diupdate: ");
                    int idU = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Kode MK baru: ");
                    kode = sc.nextLine();
                    System.out.print("Nama MK baru: ");
                    namaMK = sc.nextLine();
                    System.out.print("SKS baru: ");
                    sks = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nilai baru: ");
                    nilai = sc.nextLine();
                    tr.update(idU, kode, namaMK, sks, nilai);
                    break;

                case 'D':
                    tr.cetak();
                    System.out.print("ID yang dihapus: ");
                    int idD = sc.nextInt();
                    sc.nextLine();
                    tr.delete(idD);
                    break;
            }

        } while (menu != 'X');
    }
}
