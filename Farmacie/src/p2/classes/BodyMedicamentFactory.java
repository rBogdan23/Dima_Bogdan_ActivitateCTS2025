package p2.classes;

public class BodyMedicamentFactory implements CategorieMedicamentFactory {
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new MedicamentImp1(denumire, pret);
    }
}