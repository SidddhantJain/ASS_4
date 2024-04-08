public class Associate_professor extends Employee{
    long basic_pay;

    public Associate_professor(String name, int id, String address, String mail_id, long mobile_no, long bp) {
        super.getData(name, id, address, mail_id, mobile_no, bp);
    }
}
