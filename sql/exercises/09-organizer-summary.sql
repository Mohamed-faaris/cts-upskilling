/*
9. Organizer Event Summary
For each event organizer, show the number of events created and their current status
(upcoming, completed, cancelled).
*/

SELECT u.user_id, u.full_name,
  SUM(CASE WHEN e.status = 'upcoming' THEN 1 ELSE 0 END) AS upcoming_count,
  SUM(CASE WHEN e.status = 'completed' THEN 1 ELSE 0 END) AS completed_count,
  SUM(CASE WHEN e.status = 'cancelled' THEN 1 ELSE 0 END) AS cancelled_count,
  COUNT(e.event_id) AS total_events
FROM Users u
LEFT JOIN Events e ON u.user_id = e.organizer_id
GROUP BY u.user_id, u.full_name;
