package com.snd.wave;


    interface paybonus{
        void calcincentive();
    }

    class employee{
        private int empiD;
        private String empNAME;
        private String address;
        private String dob;
        protected float salary;
        //to be used by the child a parents variables must be in protected type

        employee(int eid, String ename, String ad, String d, float s){
            empiD = eid;
            empNAME = ename;
            address = ad;
            dob = d;
            salary = s;
        }

        public void displayinfo(int eid,String ename, String ad, String d, float s){
            System.out.println("ID :"+ empiD);
            System.out.println("Name :"+ empNAME);
            System.out.println("Address :"+ address);
            System.out.println("Date of Birth :"+ dob);
            System.out.println("Salary :"+ salary);
        }
    }

    class executive extends employee implements paybonus{
        public executive(int eid, String ename, String ad, String d, float s, float travel) {
            super(eid, ename, ad, d, s);
        }

        public void calcincentive() {
            float incentive;

            if (salary>5000) {
                incentive = salary + (salary / 10);
            } else {
                incentive = 0;
            }
            System.out.println("Incentive :"+incentive);
        }
    }

public class Main {

    public static void main(String[] args) {
        executive obj = new executive(1002,"Smith","52, Main Road, africa","1925-10-05",89000,5000);
    }
}
