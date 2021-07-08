package cn.edu.jxnu.practice;

import cn.edu.jxnu.practice.PermutationString;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class PermutationStringTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b1e237e2874517a1() {

    // Act, creating object to test constructor
    final PermutationString actual = new PermutationString();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputVoid9994ea50920608d1998() {

    // Arrange
    final String[] arg0 = { "ABCDE", "ABCDE", "ABCDE" };

    // Act
    PermutationString.main(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void moveStringInputNotNullOutputVoid999b95f70d114572499() {

    // Arrange
    final String arg0 = "ABCDE";

    // Act
    PermutationString.moveString(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void permutationInputNotNullOutput1209994c0b420d0de72448() {

    // Arrange
    final PermutationString thisObj = new PermutationString();
    final String arg0 = "ABCDE";

    // Act
    final ArrayList<String> actual = thisObj.permutation(arg0);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("ABCDE");
    arrayList.add("ABCED");
    arrayList.add("ABDCE");
    arrayList.add("ABDEC");
    arrayList.add("ABECD");
    arrayList.add("ABEDC");
    arrayList.add("ACBDE");
    arrayList.add("ACBED");
    arrayList.add("ACDBE");
    arrayList.add("ACDEB");
    arrayList.add("ACEBD");
    arrayList.add("ACEDB");
    arrayList.add("ADBCE");
    arrayList.add("ADBEC");
    arrayList.add("ADCBE");
    arrayList.add("ADCEB");
    arrayList.add("ADEBC");
    arrayList.add("ADECB");
    arrayList.add("AEBCD");
    arrayList.add("AEBDC");
    arrayList.add("AECBD");
    arrayList.add("AECDB");
    arrayList.add("AEDBC");
    arrayList.add("AEDCB");
    arrayList.add("BACDE");
    arrayList.add("BACED");
    arrayList.add("BADCE");
    arrayList.add("BADEC");
    arrayList.add("BAECD");
    arrayList.add("BAEDC");
    arrayList.add("BCADE");
    arrayList.add("BCAED");
    arrayList.add("BCDAE");
    arrayList.add("BCDEA");
    arrayList.add("BCEAD");
    arrayList.add("BCEDA");
    arrayList.add("BDACE");
    arrayList.add("BDAEC");
    arrayList.add("BDCAE");
    arrayList.add("BDCEA");
    arrayList.add("BDEAC");
    arrayList.add("BDECA");
    arrayList.add("BEACD");
    arrayList.add("BEADC");
    arrayList.add("BECAD");
    arrayList.add("BECDA");
    arrayList.add("BEDAC");
    arrayList.add("BEDCA");
    arrayList.add("CABDE");
    arrayList.add("CABED");
    arrayList.add("CADBE");
    arrayList.add("CADEB");
    arrayList.add("CAEBD");
    arrayList.add("CAEDB");
    arrayList.add("CBADE");
    arrayList.add("CBAED");
    arrayList.add("CBDAE");
    arrayList.add("CBDEA");
    arrayList.add("CBEAD");
    arrayList.add("CBEDA");
    arrayList.add("CDABE");
    arrayList.add("CDAEB");
    arrayList.add("CDBAE");
    arrayList.add("CDBEA");
    arrayList.add("CDEAB");
    arrayList.add("CDEBA");
    arrayList.add("CEABD");
    arrayList.add("CEADB");
    arrayList.add("CEBAD");
    arrayList.add("CEBDA");
    arrayList.add("CEDAB");
    arrayList.add("CEDBA");
    arrayList.add("DABCE");
    arrayList.add("DABEC");
    arrayList.add("DACBE");
    arrayList.add("DACEB");
    arrayList.add("DAEBC");
    arrayList.add("DAECB");
    arrayList.add("DBACE");
    arrayList.add("DBAEC");
    arrayList.add("DBCAE");
    arrayList.add("DBCEA");
    arrayList.add("DBEAC");
    arrayList.add("DBECA");
    arrayList.add("DCABE");
    arrayList.add("DCAEB");
    arrayList.add("DCBAE");
    arrayList.add("DCBEA");
    arrayList.add("DCEAB");
    arrayList.add("DCEBA");
    arrayList.add("DEABC");
    arrayList.add("DEACB");
    arrayList.add("DEBAC");
    arrayList.add("DEBCA");
    arrayList.add("DECAB");
    arrayList.add("DECBA");
    arrayList.add("EABCD");
    arrayList.add("EABDC");
    arrayList.add("EACBD");
    arrayList.add("EACDB");
    arrayList.add("EADBC");
    arrayList.add("EADCB");
    arrayList.add("EBACD");
    arrayList.add("EBADC");
    arrayList.add("EBCAD");
    arrayList.add("EBCDA");
    arrayList.add("EBDAC");
    arrayList.add("EBDCA");
    arrayList.add("ECABD");
    arrayList.add("ECADB");
    arrayList.add("ECBAD");
    arrayList.add("ECBDA");
    arrayList.add("ECDAB");
    arrayList.add("ECDBA");
    arrayList.add("EDABC");
    arrayList.add("EDACB");
    arrayList.add("EDBAC");
    arrayList.add("EDBCA");
    arrayList.add("EDCAB");
    arrayList.add("EDCBA");
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reverseCharArrayInputNotNullZeroZeroOutputNotNull9995ed64c353c5df4fe() {

    // Arrange
    final PermutationString thisObj = new PermutationString();
    final String arg0 = "ABCDE";
    final int arg1 = 0;
    final int arg2 = 0;

    // Act
    final String actual = thisObj.reverseCharArray(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals("ABCDE", actual);

  }
}
