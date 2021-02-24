import React, { Component } from 'react';

class StockForm extends React.Component {

    state = {
        stock: "",
        amount: "",
        date: "",
    };

    handleInputChange = event => {
        const { name, value } = event.target;

        this.setState({
            [name]: value
        });
    };

    handleFormSubmit = event => {
        event.preventDefault();
        alert("")
    }

    render() {
        return (
            <div className="stockForm">
                <form className="form">
                    <input
                        value={this.state.stock}
                        name="stockName"
                        onChange= {this.handleInputChange}
                        type="text"
                        placeholder="Enter Stock Name"
                    />
                    <input
                        value={this.state.amount}
                        name="stockAmount"
                        onChange= {this.handleInputChange}
                        type="text"
                        placeholder="Enter Dollar Amount."
                    />
                    <input
                        value={this.state.date}
                        name="purchaseDate"
                        onChange= {this.handleInputChange}
                        type="text"
                        placeholder="Enter Date: ex 2021-02-23"
                    />
                    <button onClick={this.handleFormSubmit}>Submit Order</button>
                </form>
            </div>
        );
    }
}

export default StockForm;