package predicate;

import model.Account;
import model.Person;

public class PredicateAccountsByOwner implements AccountPredicate{
    Person owner;

    public PredicateAccountsByOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public boolean test(Account account) {
        return account.getOwner().equals(owner);
    }
}
