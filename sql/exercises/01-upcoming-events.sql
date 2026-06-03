/*
1. User Upcoming Events
Show a list of all upcoming events a user is registered for in their city, sorted by date.
*/

SELECT DISTINCT e.*
FROM Events e
JOIN Registrations r ON e.event_id = r.event_id
JOIN Users u ON r.user_id = u.user_id
WHERE e.city = u.city
  AND e.status = 'upcoming'
ORDER BY e.start_date;
