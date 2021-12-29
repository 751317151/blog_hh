module.exports = {
  transpileDependencies: ["vuetify"],
  devServer: {
    port: 8081,
    proxy: {
      "/api": {
        target: "http://localhost:8090",
        changeOrigin: true,
        pathRewrite: {
          "^/api": ""
        }
      }
    },
    disableHostCheck: true
  },
  productionSourceMap: false,
  css: {
    extract: true,
    sourceMap: false
  }
};
