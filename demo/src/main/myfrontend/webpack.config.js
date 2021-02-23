const path = require('path');

module.exports = {
  entry: './src/index.js',
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, '../resources/static'),
  },
  module: {
    rules: [
      {
        test: /\.js$/,
        exclude: /(node_modules|bower_components)/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: [
              '@babel/preset-env', 
              ['@babel/preset-react', {"runtime": "automatic"}]
            ]
          }
        }
      },
      { test: /\.css$/i, use: ['style-loader', 'css-loader'], },
      { test: /\.svg/, type: 'asset/inline' }
    ]
  }
};