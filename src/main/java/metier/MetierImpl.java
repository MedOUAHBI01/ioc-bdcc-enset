package metier;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImplV2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        return t*2;
    }



    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
