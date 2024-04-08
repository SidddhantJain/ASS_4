class Assistant_professor extends Employee{
    long basic_pay;

    public Assistant_professor(String name, int id, String address, String mail_id, long mobile_no, long bp) {
        super.getData(name, id, address, mail_id, mobile_no, bp);
    }
}
