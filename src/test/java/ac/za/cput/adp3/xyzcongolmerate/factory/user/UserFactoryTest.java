package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserFactoryTest {
    Date date = new Date();

    @Test
    public void buildUser() {

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("209135816@mycput.ac.za"
                ,"Analyst","GF-XXXXXX","RF-XXXXXX",date);

        Assert.assertNotNull(userDemography);

    }
}
/**
 * Your implementation goes here
 *
 * INSTRUCTION
 * 1. Remove line [//TODO: implement method body ONLY!]
 * 1. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
 * 2. Test the UserFactory class
 * 3. Assert that the an object is created.
 */