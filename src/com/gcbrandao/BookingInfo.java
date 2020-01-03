package com.gcbrandao;

import java.time.LocalDate;

public class BookingInfo {
    Integer weeks;
    Integer daysAfter;
    Integer daysBefore;
    LocalDate checkin;
    LocalDate checkout;

    public BookingInfo() {
    }

    public BookingInfo(Integer weeks, Integer daysAfter, Integer daysBefore, LocalDate checkin, LocalDate checkout) {
        this.weeks = weeks;
        this.daysAfter = daysAfter;
        this.daysBefore = daysBefore;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getWeeks() {
        return weeks;
    }

    public void setWeeks(Integer weeks) {
        this.weeks = weeks;
    }

    public Integer getDaysAfter() {
        return daysAfter;
    }

    public void setDaysAfter(Integer daysAfter) {
        this.daysAfter = daysAfter;
    }

    public Integer getDaysBefore() {
        return daysBefore;
    }

    public void setDaysBefore(Integer daysBefore) {
        this.daysBefore = daysBefore;
    }

    public LocalDate getCheckin() { return checkin; }

    public void setCheckin(LocalDate checkin) {  this.checkin = checkin; }

    public LocalDate getCheckout() { return checkout; }

    public void setCheckout(LocalDate checkout) { this.checkout = checkout; }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();

        str.append("{").append("\n")
                .append("noitesExtrasComeco:").append(this.getDaysBefore()).append("\n")
                .append("semanas:").append(this.getWeeks()).append("\n")
                .append("noitesExtrasFim:").append(this.getDaysAfter()).append("\n")
                .append("checkin:").append(this.getCheckin().toString()).append("\n")
                .append("checkout:").append(this.getCheckout().toString()).append("\n")
                .append("}");

        return str.toString();
    }
}
