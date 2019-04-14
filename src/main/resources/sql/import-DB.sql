ALTER TABLE post MODIFY body TEXT null;

-- Insert Users

INSERT INTO USER (user_id, password, email, username, first_name, last_name)
VALUES (1, '12345', 'user@mail.com', 'mbrahma', 'Marci', 'Brahma');

INSERT INTO USER (user_id, password, email, username, first_name, last_name)
VALUES (2, '12345', 'johndoe@gmail.com', 'johndoe', 'John', 'Doe');

INSERT INTO USER (user_id, password, email, username, first_name, last_name)
VALUES (3, '12345', 'ana@mail.com', 'ana', 'Ana', 'Surname');

-- Insert Posts
INSERT INTO POST (post_id, title, body, create_date, user_id)
VALUES (1, 'ZipZapZop First Blog', 'This is the first blog for the site! Thank you for visiting the site. We hope you enjoy the content', '2019-04-09',1);

INSERT INTO POST (post_id, title, body, create_date, user_id)
VALUES (2, 'Little Teapot', 'I’m a little teapot, short and stout Here’s my handle (place hand on hip) Here’s my spout (stick your other arm out straight)
 When I get all steamed up, hear me shout Just tip me over and pour me out (lean over with your spout arm)', '2019-04-09',1);

INSERT INTO POST (post_id, title, body, create_date, user_id)
VALUES (3, 'Humpty Dumpty', 'Humpty Dumpty sat on a wall, Humpty Dumpty had a great fall, All the king’s horses and all the king’s men, Couldn’t put Humpty together again.', '2019-04-09',2);

INSERT INTO POST (post_id, title, body, create_date, user_id)
VALUES (4, 'Hey Diddle Diddle', 'Hey diddle diddle, the cat and the fiddle, The cow jumped over the moon. The little dog laughed to see such fun And the dish ran away with the spoon!', current_timestamp,3);

INSERT INTO POST (post_id, title, body, create_date, user_id)
VALUES (5, 'Clean Code', 'It should be elegant — Clean code should be pleasing to read. Reading it should make you smile the way a well-crafted music box or well-designed car would.
Clean code is focused —Each function, each class, each module exposes a single-minded attitude that remains entirely undistracted, and unpolluted, by the surrounding details.
Clean code is taken care of. Someone has taken the time to keep it simple and orderly. They have paid appropriate attention to details. They have cared.
Runs all the tests Contains no duplication Minimize the number of entities such as classes, methods, functions, and the like.', '2019-04-09',3);

-- Insert comments

INSERT INTO COMMENT (comment_id, body, create_date, post_id, user_id)
VALUES (1, 'Cool!', {ts '2016-10-19 11:10:13.247'}, 1, 3);

INSERT INTO COMMENT (comment_id, body, create_date, post_id, user_id)
VALUES (2, 'You are a little teapot lol', CURRENT_TIMESTAMP, 2, 1);

INSERT INTO COMMENT (comment_id, body, create_date, post_id, user_id)
VALUES (3, 'So sad about humpty dumpty', CURRENT_TIMESTAMP, 3, 1);

INSERT INTO COMMENT (comment_id, body, create_date, post_id, user_id)
VALUES (4, 'So cute!', CURRENT_TIMESTAMP, 2, 3);

-- Insert Tags
INSERT INTO TAG (tag_id, key_word)
VALUES (1, 'Nursery Rhymes');

INSERT INTO TAG (tag_id, key_word)
VALUES (2, 'Advice');

-- Insert into PostTags

INSERT INTO POST_TAG (post_id, tag_id)
VALUES (2,1);

INSERT INTO POST_TAG (post_id, tag_id)
VALUES (3,1);

INSERT INTO POST_TAG (post_id, tag_id)
VALUES (4,1);

INSERT INTO POST_TAG (post_id, tag_id)
VALUES (5,2);

