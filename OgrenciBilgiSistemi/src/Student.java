public class Student {

    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stNo;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stNo = stNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int noteMat, int noteFizik, int noteKimya) {
        if (noteMat >= 0 && noteMat <= 100) {
            this.mat.note = noteMat;
        }
        if (noteFizik >= 0 && noteFizik <= 100) {
            this.fizik.note = noteFizik;
        }
        if (noteKimya >= 0 && noteKimya <= 100) {
            this.kimya.note = noteKimya;
        }
    }

    void addBulkExamSozluNote(int sozluNoteMat, int sozluNotFizik, int sozluNoteKimya) {
        if (sozluNoteMat >= 0 && sozluNoteMat <= 100) {
            this.mat.sozluNote = sozluNoteMat;
        }
        if (sozluNotFizik >= 0 && sozluNotFizik <= 100) {
            this.fizik.sozluNote = sozluNotFizik;
        }
        if (sozluNoteKimya >= 0 && sozluNoteKimya <= 100) {
            this.kimya.sozluNote = sozluNoteKimya;
        }
    }

    void isPass() {
        System.out.println("=======================================");
        double sozluToplam = ((this.mat.sozluNote * this.mat.sozluYuzdesi) + (this.fizik.sozluNote * this.fizik.sozluYuzdesi) + (this.kimya.sozluNote * this.kimya.sozluYuzdesi)) / 3;
        double notToplam = (this.mat.note * (1 - this.mat.sozluYuzdesi) + this.fizik.note * (1- this.fizik.sozluYuzdesi) + this.kimya.note * (1 - this.kimya.sozluYuzdesi)) / 3;
        this.avarage = sozluToplam + notToplam;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz!");
            isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız!");
            isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.mat.name + " Notu:" + this.mat.note);
        System.out.println(this.mat.name + " Sözlü Notu:" + this.mat.sozluNote);
        System.out.println(this.fizik.name + " Notu:" + this.fizik.note);
        System.out.println(this.fizik.name + " Sözlü Notu:" + this.fizik.sozluNote);
        System.out.println(this.kimya.name + " Notu:" + this.kimya.note);
        System.out.println(this.kimya.name + " Sözlü Notu:" + this.kimya.sozluNote);
        System.out.println("Ortalamanız: " + this.avarage);
    }

}
