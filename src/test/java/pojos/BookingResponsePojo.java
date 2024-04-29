package pojos;

public class BookingResponsePojo {
    private Integer bookingid;
    private BookingDatesPojo booking;

    public BookingResponsePojo() {
    }

    public BookingResponsePojo(Integer bookingid, BookingDatesPojo booking) {
        this.bookingid = bookingid;
        this.booking = booking;
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public BookingDatesPojo getBooking() {
        return booking;
    }

    public void setBooking(BookingDatesPojo booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "BookingResponsePojo{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }
}








