package hashCodeAndEquals;

public class BlackBox {

    private final int additive;
    private int input1;
    private int input2;

    public BlackBox(int add){
        additive = add;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void updateIns(int in1, int in2){
        input1 = in1;
        input2 = in2;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return  true;

        if (!(obj instanceof BlackBox)) return false;

        BlackBox that = (BlackBox) obj;

        return additive == that.additive
                &&
                input1 == that.input1
                &&
                input2 == that.input2;
    }


    public static void main(String[] args) {

        BlackBox bb1 = new BlackBox(13);
        BlackBox bb2 = new BlackBox(13);
        Object bb3 = new BlackBox(13);

        System.out.print(bb2.equals(bb3) + " ");
        bb1.updateIns(1, 4);
        System.out.print(bb1.equals(bb1) + " ");

        System.out.print(bb1.equals(bb3) + " ");
        bb2.updateIns(1, 4);
        System.out.print(bb2.equals(bb1));
    }
}
