package Session8_KiemTra;

class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Ten: " + name + " | Diem: " + score + " | Hoc luc: " + getRank();
    }
}
