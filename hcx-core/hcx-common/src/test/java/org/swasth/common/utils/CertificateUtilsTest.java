package org.swasth.common.utils;

import org.junit.Test;

import java.security.cert.CertificateException;

import static org.junit.Assert.assertNotNull;

public class CertificateUtilsTest {

    @Test
    public void testGetExpiry() throws CertificateException {
        assertNotNull(CertificateUtils.getExpiry("-----BEGIN CERTIFICATE-----\nMIIC6jCCAdKgAwIBAgIGAX4A5QsDMA0GCSqGSIb3DQEBCwUAMDYxNDAyBgNVBAMM K0hpYmx5bXRVSXl2ZVU4cDVSODZZdzVsMVVYdjQ2SU1GYjByMjkyMENWdHcwHhcN MjExMjI4MTE1NTE3WhcNMjIxMDI0MTE1NTE3WjA2MTQwMgYDVQQDDCtIaWJseW10 VUl5dmVVOHA1Ujg2WXc1bDFVWHY0NklNRmIwcjI5MjBDVnR3MIIBIjANBgkqhkiG 9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhvlyz2Igsa2au9SF/sO7qAxsRiO6su12g2y9 wSRN947u643az+8LADlkbzPASMlrkWWYZfcRvru5f+zrGQMxqKiO6ft9sfq/SCVc 26Cw2o5OrafzT4NXLHO39jOQbuq5CxL6yi893YMt0PdvKzLA960pswS3pXyk6Pmg 17wjosNXTFrGWXZBKQkycR9/TW9iuEufZDv0dhrUlP0DC6uuZt+F3DGaQ7WrQNbt UvCXWTTXjAjvjbhSgcyH711AkPI5H+4etdvlD9QGIaMgjBac1GfW+5YkBfU2KV9T Mq/7U++VirkZZBZXAC1K7VbJC/CgNMOrANJ1+XzkVbLlXoVXgwIDAQABMA0GCSqG SIb3DQEBCwUAA4IBAQBnLAUhz56DZC28byQz0GS/GdgGMiobkxFvtHNCutb9cFOp PXc3mX4/69B8vfu0dncjLKiMOv/S+IzoUjqSiJpackA84oODZb7baBH/Ogqa9ZkY vxA2O1DsbANQrbfiBjKRIiCGCTzWCCD2vPJdjoJiActL3gbGaENKM6Ft0FO5D7sp kaFOBvIjfXvxvfFrS/BwivoKWESpD4ZmlcafQweGfSJVECRZ5Oc+T0lg+0S20NlP vmlozyceiVTXAqpPngK8Jc3VuDeG4xRLI9J0DwDV0rtUbPzdVBzAO9KgrnsxYzRQ 8LmmugWhh4L+QwIJe+1NWmULmPG+he+/lBiFD0Jg\n-----END CERTIFICATE-----"));
    }
}
