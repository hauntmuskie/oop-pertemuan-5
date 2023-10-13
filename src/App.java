import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    /*
     * Nama  : Rionggo Rahardi
     * NPM   : 202143501540
     * Kelas : R5Q
     */

    static int biayaAlat, biayaBahan, biayaTransport, total;
    static List<Integer> selectedServices = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pemesanan pemesanan = getUserInput(reader);
        Transaksi transaksi = processTransaction(reader);

        total = calculateTotal();

        displaySummary(pemesanan, transaksi, total);

        try {
            reader.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    private static Pemesanan getUserInput(BufferedReader reader) {
        Pemesanan pemesanan = new Pemesanan();

        System.out.println("---Car Cleaning.. Anda Pesan Kami Datang--");
        System.out.println("================================================");
        System.out.println("------------------o0o------------------");
        System.out.println("Masukkan Data Pemesanan");

        try {
            System.out.print("Masukkan nama             ");
            pemesanan.setNama(reader.readLine());
            System.out.print("Masukkan alamat           ");
            pemesanan.setAlamat(reader.readLine());
            System.out.print("Masukkan nomor telepon    ");
            pemesanan.setTelpon(reader.readLine());
            System.out.print("Masukkan email            ");
            pemesanan.setEmail(reader.readLine());
            System.out.println();
        } catch (IOException e) {
            e.getStackTrace();
        }

        return pemesanan;
    }

    private static Transaksi processTransaction(BufferedReader reader) {
        Transaksi transaksi = new Transaksi();
        Pemesanan pemesanan;
        pemesanan = new Pemesanan();
        transaksi.viewjasa();

        try {
            System.out.print("Pilih jasa : ");
            int selectedService = Integer.parseInt(reader.readLine());
            selectedServices.add(selectedService);

            transaksi.viewteam();

            System.out.print("Pilih team  : ");
            transaksi.team = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan keterangan tambahan: \nDatang jam ");
            pemesanan.setKeterangan(reader.readLine());
            System.out.println();

            System.out.print("Masukan Biaya Jasa Alat       Rp. ");
            biayaAlat = Integer.parseInt(reader.readLine());

            System.out.print("Masukan Biaya Bahan jasa      Rp. ");
            biayaBahan = Integer.parseInt(reader.readLine());

            System.out.print("Masukan Biaya Transportasi    Rp. ");
            biayaTransport = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }

        return transaksi;
    }

    private static int calculateTotal() {
        int total = 0;

        for (int service : selectedServices) {
            total += service;
        }

        total += biayaAlat + biayaBahan + biayaTransport;
        return total;
    }

    private static void displaySummary(Pemesanan pemesanan, Transaksi transaksi, int total) {
        System.out.println("------------------o0o------------------");
        System.out.println("================================================");
        System.out.println("Jenis Jasa            " + selectedServices);
        System.out.println("Team Penyedia Jasa    " + transaksi.getTeam());
        System.out.println("Keterangan            Datang Jam" + pemesanan.getKeterangan());
        System.out.println();
        System.out.println("Total Biaya yang di Bayar Pemesan Rp. " + total);
        System.out.println();
        System.out.println("Salam bersih " + pemesanan.getNama() + " Terima kasih");
    }
}
