public class AutoPark {
    Auto[] autos;

    public AutoPark(Auto[] autos) {
        this.autos = autos;
    }

    public String toString(){
        String res="";
        for (int i = 0; i < autos.length; i++) {
            res= res+autos[i]+"\n";
        }
        return res;
    }

    public  Auto getMaxPriceAuto(){  // O(n)
        Auto max = autos[0];
        for (int i = 0; i < autos.length ; i++) {
            if (autos[i].price>max.price){
                max = autos[i];
            }
        }
        return max;
    }

    public int getSize(){
        return autos.length;
    }

}
