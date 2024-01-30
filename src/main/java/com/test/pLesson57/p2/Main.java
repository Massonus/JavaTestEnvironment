package com.test.pLesson57.p2;

public class Main {

    public static void main(String[] args) {

        AccountUtils accountUtils = new AccountUtils();

        Account account = new Account();
        account.setName("Lisa");
        account.setAmount(200.0D);

        accountUtils.saveAccount(account);

        final Profile profile = new Profile();
        profile.setType("B");
        profile.setAccount(account);

        accountUtils.savProfile(profile);

        final String byId = accountUtils.getProfileTypeById(1);
        System.out.println(byId);
    }

}
