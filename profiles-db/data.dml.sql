DELETE FROM contract_types;
DELETE FROM profiles;

INSERT INTO contract_types(name)
	VALUES('Permanent'),('Contractor');
	
INSERT INTO profiles(first_name, last_name, identifier, email, job_title, contract_id, hiring_date, avatar, description, tech_lead)
	VALUES ('Alan', 'Turing', 'tturing030123', 'alan@turing.com', 'Software Engineer',(
		SELECT id FROM contract_types WHERE name ='Permanent'
		), '2023-01-03', 'alan-turing.jpg','Excellent team member to decipher user''s need.', true),
	('Ada', 'Lovelace', 'alovela030123', 'ada@lovelace.com', 'Back-end Developer', (
		SELECT id FROM contract_types WHERE name ='Permanent'
		), '2023-01-03', 'ada-lovelace.jpg','Every team needs a pioneer.', false),
	('Tim', 'Berners-Lee', 'tberner030123', 'tim@berners-lee.com', 'Fullstack Developer', (
		SELECT id FROM contract_types WHERE name ='Contractor'
		), '2023-01-03', 'berners-lee.jpg', 'Best ally to connect with.', true),
	('Grace', 'Hopper', 'ghopper030123', 'grace@hopper.com', 'Back-end Developer', (
		SELECT id FROM contract_types WHERE name ='Contractor'
		), '2023-01-03', 'grace-hopper.jpg', 'Grandma COBOL', true);