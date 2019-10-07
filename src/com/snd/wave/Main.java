package com.snd.wave;


    interface paybonus{
        void calcincentive();
    }

    class employee{
        private int employeeid;
        private String employeename;
        private String address;
        private String dob;
        protected float salary;
        //to be used by the child a parents variables must be in protected type

        employee(int eid, String ename, String ad, String d, float s){
            employeeid = eid;
            employeename = ename;
            address = ad;
            dob = d;
            salary = s;
        }

        public void displayinfo(int eid,String ename, String ad, String d, float s){
            System.out.println("ID :"+ eid);
            System.out.println("Name :"+ ename);
            System.out.println("Address :"+ ad);
            System.out.println("Date of Birth :"+ d);
            System.out.println("Salary :"+ s);
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
        executive obj = new executive(1002,"John Doe","123, Main Road, Wakanda","1980-10-05",89000,5000);
    }
}
