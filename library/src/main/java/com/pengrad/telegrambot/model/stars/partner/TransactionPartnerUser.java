package com.pengrad.telegrambot.model.stars.partner;

import com.pengrad.telegrambot.model.User;
import com.pengrad.telegrambot.model.chatbackground.BackgroundFillFreeformGradient;
import com.pengrad.telegrambot.model.paidmedia.PaidMedia;

import java.util.Arrays;
import java.util.Objects;

public class TransactionPartnerUser extends TransactionPartner {

    public final static String TYPE = "user";

    private User user;
    private String invoice_payload;
    private PaidMedia[] paid_media;

    public TransactionPartnerUser() {
        super(TYPE);
    }

    public User user() {
        return user;
    }

    public String invoicePayload() {
        return invoice_payload;
    }

    public PaidMedia[] paidMedia() {
        return paid_media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransactionPartnerUser that = (TransactionPartnerUser) o;
        return Objects.equals(user, that.user) && Objects.equals(invoice_payload, that.invoice_payload) && Objects.deepEquals(paid_media, that.paid_media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), user, invoice_payload, Arrays.hashCode(paid_media));
    }

    @Override
    public String toString() {
        return "TransactionPartnerUser{" +
                "user=" + user +
                ", invoice_payload='" + invoice_payload + '\'' +
                ", paid_media=" + Arrays.toString(paid_media) +
                '}';
    }
}
