package com.zosh.model;

public class PaymentDetails {

    private String paymentMethod;
    private String status;
    private String paymentId;
    private String razorpayPaymentLinkId;
    private String razorpayPaymentLinkReferenceId;
    private String razorpayPaymentLinkSuccess;
    private String razorpayPaymentId;

//    public PaymentDetails(String paymentMethod, String status, String paymentId, String razorpayPaymentLinkId, String razorpayPaymentLinkReferenceId, String razorpayPaymentLinkSuccess, String razorpayPaymentId) {
//        this.paymentMethod = paymentMethod;
//        this.status = status;
//        this.paymentId = paymentId;
//        this.razorpayPaymentLinkId = razorpayPaymentLinkId;
//        this.razorpayPaymentLinkReferenceId = razorpayPaymentLinkReferenceId;
//        this.razorpayPaymentLinkSuccess = razorpayPaymentLinkSuccess;
//        this.razorpayPaymentId = razorpayPaymentId;
//    }

    public PaymentDetails() {
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getRazorpayPaymentLinkId() {
        return razorpayPaymentLinkId;
    }

    public void setRazorpayPaymentLinkId(String razorpayPaymentLinkId) {
        this.razorpayPaymentLinkId = razorpayPaymentLinkId;
    }

    public String getRazorpayPaymentLinkReferenceId() {
        return razorpayPaymentLinkReferenceId;
    }

    public void setRazorpayPaymentLinkReferenceId(String razorpayPaymentLinkReferenceId) {
        this.razorpayPaymentLinkReferenceId = razorpayPaymentLinkReferenceId;
    }

    public String getRazorpayPaymentLinkSuccess() {
        return razorpayPaymentLinkSuccess;
    }

    public void setRazorpayPaymentLinkSuccess(String razorpayPaymentLinkSuccess) {
        this.razorpayPaymentLinkSuccess = razorpayPaymentLinkSuccess;
    }

    public String getRazorpayPaymentId() {
        return razorpayPaymentId;
    }

    public void setRazorpayPaymentId(String razorpayPaymentId) {
        this.razorpayPaymentId = razorpayPaymentId;
    }
}
