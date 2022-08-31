package com.bridgelabz.userReg;

import org.junit.Test;
import org.junit.Assert;

public class UserLoginTest {

    @Test
    public void givenFirstname_whenValid_shouldReturnTrue()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname = "Talibsheikh";
        boolean validity_check= userLoginMain.FirstNameValidator(firstname);
        Assert.assertEquals(true,validity_check);

    }

    @Test
    public void givenFirstname_whenlessThan3Char_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname1 = "Ti";
        boolean validity_check1= userLoginMain.FirstNameValidator(firstname1);
        Assert.assertEquals(false,validity_check1);
    }

    @Test
    public void givenFirstname_whenAllSmallChar_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="talibsheikh";
        boolean validity_check= userLoginMain.FirstNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }

    @Test
    public void givenFirstname_whenNumberAdded_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="T1lib";
        boolean validity_check= userLoginMain.FirstNameValidator(firstname);
        Assert.assertEquals(false,validity_check);

    }
    @Test
    public void givenFirstname_whenSplCharAdded_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="T!alib";
        boolean validity_check= userLoginMain.FirstNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenFirstname_whenMiddleCharCaps_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="TaLiB";
        boolean validity_check= userLoginMain.FirstNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }
    ////----------------------LASTNAME CHECKING-------------------------

    @Test
    public void givenLastname_whenValid_shouldReturnTrue()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname = "Sheikh";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(true,validity_check);
    }

    @Test
    public void givenLastname_whenlessThan3Char_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname = "Sh";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenLastname_whenAllSmallChar_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="sheikh";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }

    @Test
    public void givenLastname_whenNumberAdded_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="S1heikh";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);

    }
    @Test
    public void givenLastname_whenSplCharAdded_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="S!heikh";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }
    @Test
    public void givenLastname_whenMiddleCharCaps_whenInvalid_shouldReturnFalse()
    {
        UserLoginMain userLoginMain = new UserLoginMain();
        String firstname ="SiHeikh";
        boolean validity_check= userLoginMain.LastNameValidator(firstname);
        Assert.assertEquals(false,validity_check);
    }









}