import java.util.Objects;

public class Account {
    private String iban;
    private Person owner;

    public Account(String iban, Person owner) {
        this.iban = iban;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", owner=" + owner +
                '}';
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (!Objects.equals(iban, account.iban)) return false;
        return Objects.equals(owner, account.owner);
    }

    @Override
    public int hashCode() {
        int result = iban != null ? iban.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
