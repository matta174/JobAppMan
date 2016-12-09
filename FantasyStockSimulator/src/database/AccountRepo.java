package database;

/**
 * Created by Matthew on 12/8/2016.
 */

import java.util.Collections;
import java.util.List;



import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.org.apache.bcel.internal.Repository;
import domain.Account;
import domain.stock


public class AccountRepo extends Repository<Account>
{
    public AccountRepo(DatabaseSession session)
    {
        super(session,Account.class);
    }

    public List<stock> getTopAccount(int count){
        Query query = session.createQuery("FROM Account ORDER BY balance DESC");
        query.setMaxResults(count);
        return query.list();
    }

}




