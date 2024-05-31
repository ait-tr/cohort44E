public class OuterClass {
    private int outerX;



    class InnerClass{
        private int innerX;


        public InnerClass(int innerX) {
            this.innerX = innerX + outerX;
        }

        public int getInnerX() {
            return innerX;
        }

        public void setInnerX(int innerX) {
            this.innerX = innerX;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "innerX=" + innerX +
                    '}';
        }
    }

    public OuterClass(int outerX) {
        this.outerX = outerX;


    }

}

class Demo{

}
