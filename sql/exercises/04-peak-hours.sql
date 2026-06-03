/*
4. Peak Session Hours
Count how many sessions are scheduled between 10 AM to 12 PM for each event.
*/

SELECT e.event_id, e.title, COUNT(s.session_id) AS peak_sessions
FROM Events e
LEFT JOIN Sessions s ON e.event_id = s.event_id
  AND HOUR(s.start_time) >= 10
  AND HOUR(s.start_time) < 12
GROUP BY e.event_id, e.title;
