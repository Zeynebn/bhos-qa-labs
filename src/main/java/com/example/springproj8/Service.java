package com.example.springproj8;

import com.nimbusds.srp6.SRP6CryptoParams;
import com.nimbusds.srp6.SRP6Exception;
import com.nimbusds.srp6.SRP6ServerSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class Service {
    static String salt = "9876543219876543";
    static String verifier = "2858611858997298914555159660373681887095796148287747373606674973557402053003244147951197837996609654044987279321099716768753949730572791039997956776235992";
    public static SRP6CryptoParams config;
    public static SRP6ServerSession serverSession;

    @PostMapping("/new_session")
    public String new_session(@RequestBody String userID) {
        config = SRP6CryptoParams.getInstance();
        serverSession = new SRP6ServerSession(config);
        BigInteger saltS = new BigInteger(salt);
        BigInteger verifierV = new BigInteger(verifier);
        String serverPublicValue_B = serverSession.step1(userID, saltS, verifierV).toString();
        return serverPublicValue_B;
    }

    @PostMapping("/compute_values")
    public String compute_values(@RequestBody CompValReqBody compValReqBody) {
        try{
            return serverSession.step2(compValReqBody.A, compValReqBody.M1).toString();
        } catch (SRP6Exception e) {
            return "";
        }

    }
}