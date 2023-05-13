package com.jmfg.training.java15;

public sealed abstract class Payment permits CardPayment, CashPayment {

}
