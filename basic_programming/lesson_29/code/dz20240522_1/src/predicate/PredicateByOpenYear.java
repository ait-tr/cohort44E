package predicate;

import model.Account;

public class PredicateByOpenYear implements AccountPredicate{
    int year;

    public PredicateByOpenYear(int year) {
        this.year = year;
    }

    @Override
    public boolean test(Account account) {
        return account.getOpenDate().getYear()==year;
    }
}
