CREATE TABLE transaction_info (
	unique_identifier varchar(255) PRIMARY KEY NOT NULL,
	account_iban varchar(255) NOT NULL,
	amount numeric(38,2) NOT NULL,
	currency_code varchar(255) NOT NULL,
	description varchar(255) NOT NULL,
	value_date date NOT NULL
);