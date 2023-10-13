class Transaksi {
    int jasa;
    int team;

    void viewjasa() {
        System.out.println("Jenis Jasa");
        System.out.println("1. Cuci Mobil");
        System.out.println("2. Salon Mobil Interior");
        System.out.println("3. Salon Mobil Eksterior");
    }

    public String getJasa() {
        String hasil = null;

        if (this.jasa == 1) {
            hasil = "Cuci Mobil";
        } else if (this.jasa == 2) {
            hasil = "SaLon Mobil Interior";
        } else if (this.jasa == 3) {
            hasil = "SaLon Mobil Eksterior";
        }

        return hasil;
    }

    public double getBiayaJasa() {
        double hasil = 0;

        if (this.jasa == 1) {
            hasil = 1000;
        } else if (this.jasa == 2) {
            hasil = 2000;
        } else if (this.jasa == 3) {
            hasil = 3000;

        }

        return hasil;
    }

    public double getBiayaTim() {
        double hasil = 0;

        if (this.jasa == 1) {
            hasil = 500;
        } else if (this.jasa == 2) {
            hasil = 3000;
        } else if (this.jasa == 3) {
            hasil = 5000;

        }

        return hasil;
    }

    public void setJasa(int jasa) {
        this.jasa = jasa;
    }

    void viewteam() {
        System.out.println("Team Penyedia Jasa");
        System.out.println("1. Team Sea [2 orang ]");
        System.out.println("2. Team Mountain [4 Orang]");
        System.out.println("3. Team Forest [5 Orang]");
    }

    public String getTeam() {
        String hasil = "";

        if (this.team == 1) {
            hasil = "Team Sea [2 orang ]";
        } else if (this.team == 2) {
            hasil = "Team Mountain [4 Orang]";
        } else if (this.team == 3) {
            hasil = "Team Forest [5 Orang]";
        }

        return hasil;
    }

}