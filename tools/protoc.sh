#!/bin/bash
pushd src/main/proto
protoc -I=. \
          -I="$(go env GOPATH)/src/github.com/grpc-ecosystem/grpc-gateway/" \
          -I="$(go env GOPATH)/src/github.com/googleapis/googleapis/" \
          --openapiv2_out=../swagger \
          ./main.proto
popd