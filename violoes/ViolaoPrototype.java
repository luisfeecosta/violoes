abstract class ViolaoPrototype implements Cloneable {
    protected int cordas;

    public void setNumeroCordas(int cordas) {
        this.cordas = cordas;
    }

    public int getNumeroCordas() {
        return cordas;
    }

    @Override
    protected ViolaoPrototype clone() throws CloneNotSupportedException {
        return (ViolaoPrototype) super.clone();
    }
}