CREATE TABLE transaction_info (
    id bigint PRIMARY KEY AUTO_INCREMENT NOT NULL,
	unique_identifier varchar(255) NOT NULL,
	transaction_type varchar(255) NOT NULL,
	account_iban varchar(255) NOT NULL,
	amount numeric(38,2) NOT NULL,
	currency_code varchar(255) NOT NULL,
	description varchar(255) NOT NULL,
	value_date date NOT NULL
);