public class GetNameEmailStringFunction implements  ToStringFunction{
    @Override
    public String apply(Person p) {
        return p.getFirstName()+ " " + p.getLastName()+ "; " + p.getEmail();
    }
}
