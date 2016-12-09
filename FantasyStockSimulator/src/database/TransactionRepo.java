package database;

import com.sun.org.apache.bcel.internal.Repository;
import domain.transaction;
import org.apache.batik.dom.util.HashTable;


/**
 * Created by Matthew on 12/8/2016.
 */




public class TransactionRepo extends Repository<transaction>
{


    public TransactionRepo(DatabaseSession session)
    {
        super(session, transaction.class);
    }
}
