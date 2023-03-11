package lab5;
class drobi{
    protected int[]drob_1={0,0};
    protected int[]drob_2 = {0,0};
    public void setValues(int chisl_1, int znam_1){
        this.drob_1[0]=chisl_1;
        this.drob_1[1]=znam_1;
        this.drob_2[0]=1;
        this.drob_2[1]=1;
    }
    public void setValues(int chisl_1, int znam_1,int chisl_2, int znam_2){
        this.drob_1[0]=chisl_1;
        this.drob_1[1]=znam_1;
        this.drob_2[0]=chisl_2;
        this.drob_2[1]=znam_2;
    }
    protected String sum(int[]drob_1){
        if (drob_1[0]==0){
            return drob_2[0]+"/"+drob_2[1];
        }else{
            return drob_1[0]+drob_1[1]+"/"+drob_1[1];
        }
    }
    protected String sum(int[]drob_1,int[]drob_2){
        if(drob_2[0]==0){
            return drob_1[0]+"/"+drob_1[1];
        }
        if(drob_1[0]==0){
            return drob_2[0]+"/"+drob_2[1];
        }
        else{
            drob_2[0] = drob_2[0]*drob_1[1];
            drob_1[0] = drob_1[0]*drob_2[1];
            drob_1[1] = drob_1[1]*drob_2[1];
            return drob_1[0]+drob_2[0]+"/"+drob_1[1];
        }
    }
    protected String minus(int[]drob_1){
        drob_2[0]=drob_1[1]*drob_2[0];
        drob_2[1]=drob_1[1]*drob_2[0];
        return drob_1[0]-drob_2[0]+"/"+drob_1[1];
    }
    protected String minus(int[]drob_1,int[]drob_2){
        if(drob_2[0]==0){
            return drob_1[0]+"/"+drob_1[1];
        }
        if(drob_1[0]==0){
            return -drob_2[0]+"/"+drob_2[1];
        } else{
            drob_2[0] = drob_2[0]*drob_1[1];
            drob_1[0] = drob_1[0]*drob_2[1];
            drob_1[1] = drob_1[1]*drob_2[1];
            return drob_1[0]-drob_2[0]+"/"+drob_1[1];
        }
    }
    protected String umnozh(int[]drob_1){
        if (drob_1[0]==0){
            return "0";
        }else{
            return drob_1[0]+"/"+drob_1[1];
        }
    }
    protected String umnozh(int[]drob_1,int[]drob_2){
        if (drob_1[0]==0|drob_2[0]==0){
            return "0";
        }else{
            return drob_1[0]*drob_2[0]+"/"+ drob_1[1]*drob_2[1];
        }
    }
    protected String div(int[]drob_1){
        if (drob_1[0]==0){
            return "0";
        }else{
            return drob_1[0]+"/"+ drob_1[1];
        }
    }
    protected String div(int[]drob_1,int[]drob_2){
        if (drob_1[0]==0){
            return "0";
        }
        else{
            return drob_1[0]*drob_2[1]+"/"+ drob_1[1]*drob_2[0];
        }
    }
}
public class task {
    public static void main(String[] args) {
        drobi drobi = new drobi();
        drobi.setValues(1,2);
        System.out.println(drobi.div(drobi.drob_1));
        System.out.println(drobi.sum(drobi.drob_1));
        System.out.println(drobi.umnozh(drobi.drob_1));
        System.out.println(drobi.minus(drobi.drob_1));
        drobi.setValues(1,1,2,1);
        System.out.println(drobi.div(drobi.drob_1, drobi.drob_2));
        System.out.println(drobi.sum(drobi.drob_1, drobi.drob_2));
        System.out.println(drobi.umnozh(drobi.drob_1, drobi.drob_2));
        System.out.println(drobi.minus(drobi.drob_1, drobi.drob_2));
    }}