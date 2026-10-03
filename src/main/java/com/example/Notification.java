///*package com.example;
//
//public class Notification {
//
//    /*
//We are building the backend for a retail order notification service. When something happens to a customer's order, the service creates a Notification for that order. Each notification has properties mentioned below. One order can have many notifications.
//
//Definitions:
//* A "Notification" is one message the service creates for an order. It has a notificationId, an orderId, and a createdAt time (in minutes since the start of the current window).
//* A "delivery status" describes where a notification is in the delivery lifecycle:
//  QUEUED, SENT, DELIVERED, or FAILED. (Delivery status is used from the next question onward.)
//* A "NotificationCenter" is the class used to manage all notifications for the window.
//
//To begin with, we present you with two tasks:
//1-1) Read through and understand the code below. Feel free to run it.
//1-2) The test for NotificationCenter is not passing due to a bug in the code. Make the necessary changes to NotificationCenter to fix the bug.
//*/
//
//import java.util.*;
//
//import org.junit.Test;
//import org.junit.runner.JUnitCore;
//import org.junit.runner.Result;
//import org.junit.runner.notification.Failure;
//
//import static org.junit.Assert.*;
//
//    public class Solution {
//
//        enum DeliveryStatus {
//            QUEUED(1),
//            SENT(2),
//            DELIVERED(3),
//            FAILED(4);
//
//            private final int rank;
//
//            DeliveryStatus(int rank) {
//                this.rank = rank;
//            }
//
//            int getRank() {
//                return rank;
//            }
//        }
//
//        /**
//         * Represents one delivery status update.
//         *
//         * Example:
//         * new Update(DeliveryStatus.SENT, 5)
//         *
//         * means the notification became SENT at minute 5.
//         */
//        record Update(DeliveryStatus status, int timestamp) {}
//
//        /** Data about a single notification created for an order. */
//        static class Notification {
//            final int notificationId;
//            final int orderId;
//            final int createdAt; // minutes since the start of the window
//
//            Notification(int notificationId, int orderId, int createdAt) {
//                this.notificationId = notificationId;
//                this.orderId = orderId;
//                this.createdAt = createdAt;
//            }
//
//
//
//            @Override
//            public boolean equals(Object other) {
//                if (!(other instanceof Notification n)) {
//                    return false;
//                }
//
//                return notificationId == n.notificationId
//                        && orderId == n.orderId
//                        && createdAt == n.createdAt;
//            }
//
//            @Override
//            public int hashCode() {
//                return Objects.hash(notificationId, orderId, createdAt);
//            }
//
//            @Override
//            public String toString() {
//                return "Notification " + notificationId
//                        + " (order " + orderId + ") created=" + createdAt;
//            }
//        }
//
//        /**
//         * Data for managing order notifications, and methods staff use to query them.
//         */
//        static class NotificationCenter {
//            private final ArrayList<Notification> notifications = new ArrayList<>();
//
//            /** Registers a notification for the current window. */
//            void addNotification(Notification notification) {
//                notifications.add(notification);
//            }
//
//            /** Returns the notification with the given ID, or null if there is no such notification. */
//            Notification getNotification(int notificationId) {
//                for (Notification notification : notifications) {
//                    System.out.println("notification"+ notificationId);
//                    System.out.println("notification.notificationId"+ notification.notificationId);
//                    if (notification.notificationId == notificationId) {
//                        System.out.println("inside 1st if");
//                        return notification;
//                    }
//                }
//
//                return null;
//            }
//
//            /** Returns the IDs of all notifications for the given order, sorted in ascending order. */
//            List<Integer> getOrderNotifications(int orderId) {
//                List<Integer> result = new ArrayList<>();
//                //System.out.println("order id"+ orderId);
//
//                //System.out.println("notification values"+ notifications);
//                for (Notification notification : notifications) {
//                    //System.out.println("notification"+ orderId);
//
//// notificatio class = {
//
////}
//
//                    if (notification.orderId == orderId) {
//                        result.add(notification.notificationId);
//                        // result.add(notification.orderId);
//                        // result.add(notification.createdAt);
//
//                    }
//                }
//
//                result.sort(Integer::compareTo);
//
//                System.out.println("after sorteing result"+result);
//                return result;
//            }
//        }
//
//        public static class TestSuite {
//
//            @Test
//            public void testNotification() {
//                System.out.println("Running testNotification");
//                Notification n = new Notification(1, 500, 30);
//
//                assertEquals(1, n.notificationId);
//                assertEquals(500, n.orderId);
//                assertEquals(30, n.createdAt);
//            }
//
//            @Test
//            public void testGetOrderNotifications() {
//                System.out.println("Running testGetOrderNotifications");
//                NotificationCenter center = new NotificationCenter();
//
//                center.addNotification(new Notification(1, 1, 0));
//                center.addNotification(new Notification(2, 2, 0));
//                center.addNotification(new Notification(3, 1, 0));
//                center.addNotification(new Notification(4, 2, 0));
//                center.addNotification(new Notification(5, 1, 0));
//
//                // Order 1 owns notifications 1, 3, and 5.
//                assertEquals(
//                        Arrays.asList(1, 3, 5),
//                        center.getOrderNotifications(1)
//                );
//
//                // Order 2 owns notifications 2 and 4.
//                assertEquals(
//                        Arrays.asList(2, 4),
//                        center.getOrderNotifications(2)
//                );
//
//                // An order with no notifications returns an empty list.
//                assertEquals(
//                        new ArrayList<>(),
//                        center.getOrderNotifications(99)
//                );
//            }
//        }
//
//        public static void main(String[] args) {
//            Result result = JUnitCore.runClasses(TestSuite.class);
//
//            for (Failure failure : result.getFailures()) {
//                System.out.println(
//                        failure.getTestHeader() + ": " + failure.getException()
//                );
//            }
//
//            if (result.wasSuccessful()) {
//                System.out.println("All tests passed successfully.");
//            } else {
//                System.err.println(
//                        "Tests failed: "
//                                + result.getFailureCount()
//                                + " test(s) failed."
//                );
//                System.exit(1);
//            }
//        }
//    }
//
//}
