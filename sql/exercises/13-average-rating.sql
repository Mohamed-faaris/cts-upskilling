/*
13. Average Rating per City
Calculate the average feedback rating of events conducted in each city.
*/

SELECT e.city, AVG(f.rating) AS avg_rating, COUNT(f.feedback_id) AS feedback_count
FROM Events e
JOIN Feedback f ON e.event_id = f.event_id
GROUP BY e.city;
