INSERT INTO app_role (id, role_name, description) VALUES (1, 'GENERAL_USER', 'General User Without Admin Rights');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (1, 'Steve', 'Smith', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'steve.smith');
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (2, 'Steffi', 'Graf', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'steffi.graf');
INSERT INTO app_user (id, first_name, last_name, password, username) VALUES (3, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.user');


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(3,1);
INSERT INTO user_role(user_id, role_id) VALUES(3,2);

-- Populate random city table

INSERT INTO stocks(id, name, price) VALUES (1, 'FB', 169);
INSERT INTO stocks(id, name, price) VALUES (2, 'APPL', 183);
INSERT INTO stocks(id, name, price) VALUES (3, 'GOOG', 978);
INSERT INTO stocks(id, name, price) VALUES (4, 'WF', 25);
INSERT INTO stocks(id, name, price) VALUES (5, 'MSFT', 67);
INSERT INTO stocks(id, name, price) VALUES (6, 'IBM', 134);

INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (1,1,1,124);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (2,1,2,107);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (3,1,3,543);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (4,1,4,17);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (5,1,5,29);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (6,2,1,101);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (7,2,2,24);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (8,2,3,79);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (9,2,4,300);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (10,2,5,23);
INSERT INTO app_user_stocks(id, stock_id, user_id, price) VALUES (11,2,6,99);


